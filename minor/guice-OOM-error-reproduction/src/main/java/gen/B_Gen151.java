
  package gen;
  public class B_Gen151 {
  		@com.google.inject.Inject
  		public B_Gen151(B_Gen152 b_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
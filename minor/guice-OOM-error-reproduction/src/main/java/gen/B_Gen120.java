
  package gen;
  public class B_Gen120 {
  		@com.google.inject.Inject
  		public B_Gen120(B_Gen121 b_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
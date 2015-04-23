
  package gen;
  public class B_Gen152 {
  		@com.google.inject.Inject
  		public B_Gen152(B_Gen153 b_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
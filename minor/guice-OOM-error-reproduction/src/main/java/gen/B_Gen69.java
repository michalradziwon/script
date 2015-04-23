
  package gen;
  public class B_Gen69 {
  		@com.google.inject.Inject
  		public B_Gen69(B_Gen70 b_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
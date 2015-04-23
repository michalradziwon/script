
  package gen;
  public class D_Gen69 {
  		@com.google.inject.Inject
  		public D_Gen69(D_Gen70 d_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
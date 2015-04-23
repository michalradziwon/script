
  package gen;
  public class D_Gen101 {
  		@com.google.inject.Inject
  		public D_Gen101(D_Gen102 d_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
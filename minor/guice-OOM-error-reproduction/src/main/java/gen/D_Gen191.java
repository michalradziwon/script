
  package gen;
  public class D_Gen191 {
  		@com.google.inject.Inject
  		public D_Gen191(D_Gen192 d_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
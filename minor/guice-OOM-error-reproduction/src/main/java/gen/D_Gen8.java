
  package gen;
  public class D_Gen8 {
  		@com.google.inject.Inject
  		public D_Gen8(D_Gen9 d_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
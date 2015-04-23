
  package gen;
  public class D_Gen7 {
  		@com.google.inject.Inject
  		public D_Gen7(D_Gen8 d_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class D_Gen137 {
  		@com.google.inject.Inject
  		public D_Gen137(D_Gen138 d_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
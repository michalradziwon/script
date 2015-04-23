
  package gen;
  public class D_Gen30 {
  		@com.google.inject.Inject
  		public D_Gen30(D_Gen31 d_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
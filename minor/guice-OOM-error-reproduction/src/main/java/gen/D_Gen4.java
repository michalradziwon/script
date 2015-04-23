
  package gen;
  public class D_Gen4 {
  		@com.google.inject.Inject
  		public D_Gen4(D_Gen5 d_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
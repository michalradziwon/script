
  package gen;
  public class D_Gen48 {
  		@com.google.inject.Inject
  		public D_Gen48(D_Gen49 d_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
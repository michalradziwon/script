
  package gen;
  public class D_Gen164 {
  		@com.google.inject.Inject
  		public D_Gen164(D_Gen165 d_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class D_Gen165 {
  		@com.google.inject.Inject
  		public D_Gen165(D_Gen166 d_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
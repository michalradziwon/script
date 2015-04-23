
  package gen;
  public class D_Gen156 {
  		@com.google.inject.Inject
  		public D_Gen156(D_Gen157 d_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class H_Gen156 {
  		@com.google.inject.Inject
  		public H_Gen156(H_Gen157 h_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
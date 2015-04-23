
  package gen;
  public class P_Gen156 {
  		@com.google.inject.Inject
  		public P_Gen156(P_Gen157 p_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class L_Gen156 {
  		@com.google.inject.Inject
  		public L_Gen156(L_Gen157 l_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
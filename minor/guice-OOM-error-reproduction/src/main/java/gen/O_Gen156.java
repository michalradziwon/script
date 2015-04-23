
  package gen;
  public class O_Gen156 {
  		@com.google.inject.Inject
  		public O_Gen156(O_Gen157 o_gen157){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen157 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
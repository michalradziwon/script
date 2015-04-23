
  package gen;
  public class O_Gen154 {
  		@com.google.inject.Inject
  		public O_Gen154(O_Gen155 o_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
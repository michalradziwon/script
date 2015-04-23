
  package gen;
  public class O_Gen183 {
  		@com.google.inject.Inject
  		public O_Gen183(O_Gen184 o_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
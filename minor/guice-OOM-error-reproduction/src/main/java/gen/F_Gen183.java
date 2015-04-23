
  package gen;
  public class F_Gen183 {
  		@com.google.inject.Inject
  		public F_Gen183(F_Gen184 f_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class F_Gen198 {
  		@com.google.inject.Inject
  		public F_Gen198(F_Gen199 f_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
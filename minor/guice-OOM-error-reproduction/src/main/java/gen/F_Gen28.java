
  package gen;
  public class F_Gen28 {
  		@com.google.inject.Inject
  		public F_Gen28(F_Gen29 f_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class F_Gen49 {
  		@com.google.inject.Inject
  		public F_Gen49(F_Gen50 f_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
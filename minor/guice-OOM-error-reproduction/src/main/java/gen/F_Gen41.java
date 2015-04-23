
  package gen;
  public class F_Gen41 {
  		@com.google.inject.Inject
  		public F_Gen41(F_Gen42 f_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
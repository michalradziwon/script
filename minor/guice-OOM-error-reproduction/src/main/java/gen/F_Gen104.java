
  package gen;
  public class F_Gen104 {
  		@com.google.inject.Inject
  		public F_Gen104(F_Gen105 f_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
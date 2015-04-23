
  package gen;
  public class F_Gen89 {
  		@com.google.inject.Inject
  		public F_Gen89(F_Gen90 f_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
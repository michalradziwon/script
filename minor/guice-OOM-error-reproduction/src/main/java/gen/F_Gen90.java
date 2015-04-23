
  package gen;
  public class F_Gen90 {
  		@com.google.inject.Inject
  		public F_Gen90(F_Gen91 f_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
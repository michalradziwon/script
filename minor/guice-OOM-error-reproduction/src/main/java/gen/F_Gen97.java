
  package gen;
  public class F_Gen97 {
  		@com.google.inject.Inject
  		public F_Gen97(F_Gen98 f_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
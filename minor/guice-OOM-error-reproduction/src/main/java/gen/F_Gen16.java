
  package gen;
  public class F_Gen16 {
  		@com.google.inject.Inject
  		public F_Gen16(F_Gen17 f_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
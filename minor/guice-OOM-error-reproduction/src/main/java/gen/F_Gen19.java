
  package gen;
  public class F_Gen19 {
  		@com.google.inject.Inject
  		public F_Gen19(F_Gen20 f_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
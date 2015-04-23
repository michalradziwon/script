
  package gen;
  public class F_Gen35 {
  		@com.google.inject.Inject
  		public F_Gen35(F_Gen36 f_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
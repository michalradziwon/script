
  package gen;
  public class F_Gen143 {
  		@com.google.inject.Inject
  		public F_Gen143(F_Gen144 f_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
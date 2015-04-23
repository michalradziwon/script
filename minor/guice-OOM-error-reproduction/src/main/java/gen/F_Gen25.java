
  package gen;
  public class F_Gen25 {
  		@com.google.inject.Inject
  		public F_Gen25(F_Gen26 f_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
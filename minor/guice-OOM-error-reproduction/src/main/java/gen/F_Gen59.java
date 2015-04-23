
  package gen;
  public class F_Gen59 {
  		@com.google.inject.Inject
  		public F_Gen59(F_Gen60 f_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
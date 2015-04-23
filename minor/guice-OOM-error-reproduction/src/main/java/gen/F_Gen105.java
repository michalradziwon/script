
  package gen;
  public class F_Gen105 {
  		@com.google.inject.Inject
  		public F_Gen105(F_Gen106 f_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
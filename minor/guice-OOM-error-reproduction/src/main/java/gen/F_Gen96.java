
  package gen;
  public class F_Gen96 {
  		@com.google.inject.Inject
  		public F_Gen96(F_Gen97 f_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
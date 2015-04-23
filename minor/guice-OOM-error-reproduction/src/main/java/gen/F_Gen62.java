
  package gen;
  public class F_Gen62 {
  		@com.google.inject.Inject
  		public F_Gen62(F_Gen63 f_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
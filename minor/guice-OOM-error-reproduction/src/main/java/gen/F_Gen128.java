
  package gen;
  public class F_Gen128 {
  		@com.google.inject.Inject
  		public F_Gen128(F_Gen129 f_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
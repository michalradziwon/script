
  package gen;
  public class F_Gen94 {
  		@com.google.inject.Inject
  		public F_Gen94(F_Gen95 f_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
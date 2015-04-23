
  package gen;
  public class F_Gen31 {
  		@com.google.inject.Inject
  		public F_Gen31(F_Gen32 f_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class F_Gen84 {
  		@com.google.inject.Inject
  		public F_Gen84(F_Gen85 f_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
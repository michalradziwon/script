
  package gen;
  public class F_Gen184 {
  		@com.google.inject.Inject
  		public F_Gen184(F_Gen185 f_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
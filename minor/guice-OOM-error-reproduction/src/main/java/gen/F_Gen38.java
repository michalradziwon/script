
  package gen;
  public class F_Gen38 {
  		@com.google.inject.Inject
  		public F_Gen38(F_Gen39 f_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
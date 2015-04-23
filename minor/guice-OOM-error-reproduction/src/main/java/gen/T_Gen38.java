
  package gen;
  public class T_Gen38 {
  		@com.google.inject.Inject
  		public T_Gen38(T_Gen39 t_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class T_Gen39 {
  		@com.google.inject.Inject
  		public T_Gen39(T_Gen40 t_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class T_Gen80 {
  		@com.google.inject.Inject
  		public T_Gen80(T_Gen81 t_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
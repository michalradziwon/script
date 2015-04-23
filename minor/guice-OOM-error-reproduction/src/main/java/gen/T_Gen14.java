
  package gen;
  public class T_Gen14 {
  		@com.google.inject.Inject
  		public T_Gen14(T_Gen15 t_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
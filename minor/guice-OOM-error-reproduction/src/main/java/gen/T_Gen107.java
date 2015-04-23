
  package gen;
  public class T_Gen107 {
  		@com.google.inject.Inject
  		public T_Gen107(T_Gen108 t_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
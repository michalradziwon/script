
  package gen;
  public class Q_Gen121 {
  		@com.google.inject.Inject
  		public Q_Gen121(Q_Gen122 q_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
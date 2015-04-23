
  package gen;
  public class Q_Gen3 {
  		@com.google.inject.Inject
  		public Q_Gen3(Q_Gen4 q_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
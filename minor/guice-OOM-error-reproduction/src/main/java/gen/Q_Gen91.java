
  package gen;
  public class Q_Gen91 {
  		@com.google.inject.Inject
  		public Q_Gen91(Q_Gen92 q_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
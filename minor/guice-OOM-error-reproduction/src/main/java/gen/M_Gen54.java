
  package gen;
  public class M_Gen54 {
  		@com.google.inject.Inject
  		public M_Gen54(M_Gen55 m_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  